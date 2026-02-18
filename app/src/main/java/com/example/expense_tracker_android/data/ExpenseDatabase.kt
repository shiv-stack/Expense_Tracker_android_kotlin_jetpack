import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.expense_tracker_android.data.model.ExpenseEntity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


@Database(entities = [ExpenseEntity::class], version = 2)

abstract class ExpenseDatabase : RoomDatabase() {

    abstract fun expenseDao(): ExpenseDao

    companion object {
        const val DATABASE_NAME = "expense_database"

        @JvmStatic
        fun getDatabase(context: Context): ExpenseDatabase {
            return Room.databaseBuilder(context, ExpenseDatabase::class.java, DATABASE_NAME)
                .addCallback(object : Callback() {
                    override fun onCreate(db: SupportSQLiteDatabase) {
                        super.onCreate(db)
                        InitBasicData(context)
                    }

                    fun InitBasicData(context: Context) {
                        CoroutineScope(Dispatchers.IO).launch {
                            val dao = getDatabase(context).expenseDao()
                            dao.insertExpense(
                                ExpenseEntity(
                                    1,
                                    "salary",
                                    5000.00,
                                    System.currentTimeMillis().toString(),
                                    "Salary",
                                    "Income"
                                )
                            )
                            dao.insertExpense(
                                ExpenseEntity(
                                    2,
                                    "paypal",
                                    1000.00,
                                    System.currentTimeMillis().toString(),
                                    "Paypal",
                                    "Income"
                                )
                            )
                            dao.insertExpense(
                                ExpenseEntity(
                                    3,
                                    "netflix",
                                    500.00,
                                    System.currentTimeMillis().toString(),
                                    "Netflix",
                                    "Expense"
                                )
                            )
                            dao.insertExpense(
                                ExpenseEntity(
                                    3,
                                    "netflix",
                                    500.00,
                                    System.currentTimeMillis().toString(),
                                    "Expense",
                                    "Expense"
                                )
                            )


                        }

                    }
                }).build()
        }

    }
}





💰 Expense Tracker App

A modern Expense Tracker Android application built using Kotlin and Jetpack Compose.
This app helps users manage their income and expenses efficiently with a clean and minimal UI.

🚀 Features

➕ Add Income & Expense

📊 View Total Balance

📈 Income & Expense Summary

🧾 Recent Transactions List

🎨 Modern UI built with Jetpack Compose

🔙 Smooth Navigation using NavController

💚 Clean and minimal design

🛠️ Built With

Kotlin

Jetpack Compose

Navigation Compose

Material Design 3

State Management (Compose State)

ConstraintLayout (Compose)

📱 Screens
🏠 Home Screen

Displays greeting message

Shows Total Balance

Displays Income & Expense summary

Lists recent transactions

Floating "Add Expense" button

➕ Add Expense Screen

Input fields:

Name

Amount

Date

Type (Income/Expense)

Category

Save transaction

Navigate back to Home screen

📸 Screenshots
Home Screen

Add Expense Screen

Make sure to place screenshots inside your project root folder or update the image path accordingly.

🧠 Architecture

The app follows a simple clean structure:

ui/
 ├── screens/
 ├── components/
navigation/
model/


Navigation handled using NavHost

State managed using remember & mutableStateOf

Recomposition handled efficiently

🔄 Navigation Example
navController.navigate("/add")
navController.popBackStack()

🎨 UI Highlights

Gradient headers

Rounded card layouts

Custom buttons

Material styling

Responsive layout

📦 Installation

Clone the repository:

git clone https://github.com/your-username/expense-tracker.git


Open in Android Studio

Run on Emulator or Physical Device

📌 Future Improvements

🗂 Room Database integration

☁️ Firebase sync

📊 Charts & Analytics

🌙 Dark Mode

🔐 Authentication

👨‍💻 Author

Shivam Thapa
Android Developer | Kotlin | Jetpack Compose

⭐ Support

If you like this project, please ⭐ star the repository.
<img width="1080" height="2400" alt="homecsreen" src="https://github.com/user-attachments/assets/58d8707a-e3bc-4266-b86b-76f75ff31dfb" />
<img width="1080" height="2400" alt="addexpense" src="https://github.com/user-attachments/assets/b4fed895-fc26-43a5-bf2e-89dde9c8ec56" />


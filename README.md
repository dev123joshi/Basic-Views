# 📱 Develop an Android Application Using Basic Views

## 📌 Project Title

**Basic Views Demo – Android Application**

---

## 🎯 Aim

To develop an Android application using basic Android Views such as **TextView, EditText, Button, ImageView, CheckBox, and RadioButton** using Kotlin and XML.

---

## 🎯 Objectives

The objectives of this experiment are:

* To understand basic Android UI Views.
* To create a user interface using XML.
* To handle user input using `EditText`.
* To use `CheckBox` and `RadioButton` for selections.
* To display images using `ImageView`.
* To handle button click events using Kotlin.
* To display the entered information on the screen.
* To understand the interaction between XML layouts and Kotlin code.

---

## 🛠️ Technologies Used

* **Android Studio**
* **Kotlin**
* **XML**
* **Android SDK**
* **Android Views**

---

## 📖 Concept / Technology

Android provides several built-in UI components called **Views**. These Views are used to create interactive user interfaces.

This application demonstrates the following basic Views:

### 1. TextView

`TextView` is used to display text such as the application title, student name and USN.

### 2. ImageView

`ImageView` is used to display an image or icon in the application.

### 3. EditText

`EditText` allows the user to enter text.

### 4. Button

`Button` performs an action when the user clicks it.

### 5. CheckBox

`CheckBox` allows the user to select or deselect an option.

### 6. RadioButton

`RadioButton` allows the user to select one option from a group.

### 7. ScrollView

`ScrollView` allows the user to scroll through the content when it does not fit completely on the screen.

---

## 💡 Scenario

The application represents a simple **Student Profile and Input Form**.

The application displays the student's name and USN and provides a form where the user can:

1. Enter a name.
2. Select a gender.
3. Accept the terms using a CheckBox.
4. Click the Submit button.
5. View the entered information on the screen.

---

## ✨ Features

* Simple user interface.
* Student name and USN display.
* Image display using ImageView.
* Name input using EditText.
* Gender selection using RadioButtons.
* Terms selection using CheckBox.
* Submit button.
* Input validation.
* Displays submitted information.
* Toast message for empty name input.

---

# 📂 Project Folder Structure

```text
BasicViewsDemo/
│
├── app/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── com/
│           │       └── example/
│           │           └── basicviewsdemo/
│           │               └── MainActivity.kt
│           │
│           ├── res/
│           │   ├── layout/
│           │   │   └── activity_main.xml
│           │   │
│           │   ├── drawable/
│           │   │
│           │   └── values/
│           │
│           └── AndroidManifest.xml
│
├── screenshots/
│   ├── testcase1.png
│   ├── testcase2.png
│   └── testcase3.png
│
└── README.md
```

---

# 📄 Important Files

## `MainActivity.kt`

This file contains the Kotlin code for the application.

It:

* Connects the XML layout to the Activity.
* Reads the user's name.
* Checks the selected RadioButton.
* Checks whether the CheckBox is selected.
* Handles the Submit button.
* Displays the result.
* Shows a Toast message when the name is empty.

---

## `activity_main.xml`

This file defines the user interface.

The layout contains:

* TextView
* ImageView
* EditText
* CheckBox
* RadioButton
* Button
* ScrollView
* LinearLayout

---

## `AndroidManifest.xml`

The Android Manifest contains the application configuration and declares `MainActivity` as the launcher Activity.

---

# ▶️ How to Run the Application

1. Open **Android Studio**.
2. Open the `BasicViewsDemo` project.
3. Wait for Gradle synchronization to finish.
4. Start an Android Emulator or connect an Android device.
5. Click **Run ▶**.
6. The Basic Views application will open.
7. Enter a name.
8. Select a gender.
9. Select the terms checkbox.
10. Click **Submit**.
11. Verify the result displayed on the screen.

---

# 📱 Output

The application initially displays:

```text
-----------------------------------

        Basic Views Demo

              👤

        Name: Devraath Joshi
        USN: 25MCAR0091

     [ Enter your name ]

     ☑ I agree to the terms

       ○ Male    ○ Female

            [Submit]

-----------------------------------
```

After submitting the form, the entered information is displayed below the Submit button.

---

# 🧪 Test Cases

## Test Case 1 – Launch Application

| Field           | Details                                |
| --------------- | -------------------------------------- |
| Test Case ID    | TC01                                   |
| Test            | Launch the application                 |
| Input           | Open the application                   |
| Expected Result | Basic Views screen should be displayed |
| Status          | Pass                                   |

The screen should display:

* Basic Views Demo
* Student Name
* USN
* ImageView
* EditText
* CheckBox
* RadioButtons
* Submit button

### Screenshot

Save the screenshot as:

```text
screenshots/testcase1.png
```

---

## Test Case 2 – Submit User Details

| Field           | Details                                |
| --------------- | -------------------------------------- |
| Test Case ID    | TC02                                   |
| Test            | Submit the form                        |
| Input           | Enter name, select gender and checkbox |
| Expected Result | Entered details should be displayed    |
| Status          | Pass                                   |

### Example Input

```text
Name: Devraath Joshi
Gender: male
Terms: Checked
```

### Expected Output

```text
Name: Devraath Joshi
Gender: male
Terms: Agreed
```

### Screenshot

Save the screenshot as:

```text
screenshots/testcase2.png
```

---

## Test Case 3 – Empty Name Validation

| Field           | Details                                              |
| --------------- | ---------------------------------------------------- |
| Test Case ID    | TC03                                                 |
| Test            | Submit without entering a name                       |
| Input           | Leave name field empty and click Submit              |
| Expected Result | Toast message "Please enter your name" should appear |
| Status          | Pass                                                 |

### Expected Message

```text
Please enter your name
```

### Screenshot

Save the screenshot as:

```text
screenshots/testcase3.png
```

---

# 👩‍🎓 Student Details

**Name:** Devraath Joshi
**USN:** 25MCAR0091

---

# 🎓 Learning Outcomes

After completing this experiment, the following concepts were understood:

* Creating Android user interfaces using XML.
* Using basic Android Views.
* Handling user input.
* Handling Button click events.
* Working with CheckBox and RadioButton.
* Displaying images using ImageView.
* Connecting XML layouts with Kotlin code.
* Performing simple input validation.
* Displaying results dynamically.

---

# ⚙️ Requirements

### Software Requirements

* Android Studio
* Kotlin
* Android SDK
* Gradle

### Hardware Requirements

* Laptop or Desktop
* Android Emulator or Android Smartphone

---

# ✅ Conclusion

The **Basic Views Android Application** was successfully developed using **Kotlin and XML in Android Studio**.

The application demonstrates the use of different Android Views including **TextView, ImageView, EditText, Button, CheckBox, and RadioButton**. It also demonstrates how user input can be collected, validated, processed and displayed using Kotlin.

Thus, the experiment provides a basic understanding of Android UI development and event handling.

---

## 📸 Screenshots

Place the three test case screenshots in the `screenshots` folder:

<img width="1787" height="962" alt="image" src="https://github.com/user-attachments/assets/c36e27c0-5695-4431-8b66-a84dbf8ec5a9" />

```

You can also display them directly in GitHub using:



# 📚 References

* Android Developer Documentation
* Android Studio Documentation
* Kotlin Documentation

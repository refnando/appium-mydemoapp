# Appium MyDemoApp – Mobile Automation Framework (Java + TestNG + Allure)

## 🧪 Overview
This repository contains a fully structured **Mobile Automation Framework** built using:
- **Java 17**
- **Appium Java Client 8**
- **Selenium 4.8.3** (Appium‑compatible)
- **TestNG 7**
- **Allure Reports** with **history + trends**
- **Maven** (Surefire)
- **Page Object Model (POM)**
- **CI/CD‑ready architecture**

Designed for **scalability, maintainability, clean separation of concerns**, and easy integration with pipelines such as GitHub Actions, Concourse CI, and Jenkins.

---

# 🏗 Architecture Overview

```
appium-mydemoapp/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── utils/
│   │   │       └── EnvConfig.java
│   │   └── resources/
│   │
│   ├── test/
│   │   ├── java/
│   │   │   ├── base/
│   │   │   │   └── BaseTest.java
│   │   │   ├── config/
│   │   │   │   └── DriverFactory.java
│   │   │   ├── listeners/
│   │   │   │   └── AllureListener.java
│   │   │   ├── pages/
│   │   │   │   └── HomePage.java
│   │   │   ├── tests/
│   │   │   │   ├── AlertsTest.java
│   │   │   │   ├── ComputeSumTest.java
│   │   │   │   ├── DisabledButtonTest.java
│   │   │   │   ├── GestureTest.java
│   │   │   │   └── SliderTest.java
│   │   │   └── utils/
│   │   │       └── WaitUtils.java
│   │   └── resources/
│   │       └── (env files)
│
├── testng.xml
├── pom.xml
├── run-tests.sh
└── .gitignore
```

---

# 📦 Tech Stack Badges

![Java](https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-A42E2B?style=for-the-badge&logo=apachemaven&logoColor=white)
![Appium](https://img.shields.io/badge/Appium-8.5.1-6700BB?style=for-the-badge&logo=appium&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-7.x-%23F5A623?style=for-the-badge)
![Allure](https://img.shields.io/badge/Allure-2.x-FF7F00?style=for-the-badge&logo=allure&logoColor=white)

---

# 🧰 Installation

### 1. Install Appium
```bash
npm install -g appium
appium driver install xcuitest
```

### 2. Install Maven dependencies
```bash
mvn clean install
```

### 3. Start Appium server
```bash
appium
```

---

# ⚙ Environment Setup

Create a `.env` file:

```
DEVICE_NAME=iPhone 15
IOS_VERSION=16.4
UDID=YOUR_SIMULATOR_UDID
APP_PATH=/path/to/TestApp.app
```

---

# ▶ Running Tests

### CLI
```bash
mvn clean test
```

### Run with script
```bash
./run-tests.sh
```

---

# 📊 Allure Reporting

### generate report
```bash
mvn allure:report
```

### serve report
```bash
mvn allure:serve
```

History & Trend are automatically copied using `maven-resources-plugin`.

---

# 🧪 Sample Test (TestNG)

```java
@Test(description = "Verify iOS alert flow")
public void contactAlert() {
    HomePage home = new HomePage(driver);
    home.tapAlertButton();
    WaitUtils.waitAlert(driver);
    Assert.assertTrue(home.isAlertDisplayed(), "Alert not shown!");
}
```

---

# 🤝 Contributing
Pull requests are welcome.

---

# 📄 License
MIT License

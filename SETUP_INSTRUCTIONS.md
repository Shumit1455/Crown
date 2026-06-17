# Crown Nutrition Tracker - Setup & Build Guide

## Prerequisites
- Android Studio (Latest version)
- JDK 17 or higher
- Android SDK API 24+ (Target 34)
- Git

## Quick Start - Build APK

### 1. Clone Repository
```bash
git clone https://github.com/Shumit1455/Crown.git
cd Crown
```

### 2. Build Debug APK
```bash
./gradlew assembleDebug
```
APK: `app/build/outputs/apk/debug/app-debug.apk`

### 3. Build Release APK
```bash
./gradlew assembleRelease
```
APK: `app/build/outputs/apk/release/app-release.apk`

## Installation

### Via ADB
```bash
adb install app/build/outputs/apk/debug/app-debug.apk
```

### Via Android Studio
1. Click Run button
2. Select device/emulator
3. Click OK

## Features
✅ Food portion tracking (grams)
✅ Nutrition breakdown (Protein, Fat, Carbs, Fiber, Calories)
✅ Daily meal categories (Breakfast, Lunch, Snacks, Dinner)
✅ Daily nutrition chart
✅ User profile with goals
✅ 100% Free - No premium features

## File Structure
```
Crown/
├── app/
│   ├── src/main/
│   │   ├── java/com/crown/nutrition/
│   │   │   ├── presentation/    (UI)
│   │   │   ├── domain/          (Logic)
│   │   │   ├── data/            (DB)
│   │   │   └── CrownApplication.kt
│   │   ├── res/
│   │   └── AndroidManifest.xml
│   └── build.gradle.kts
├── build.gradle.kts
└── settings.gradle.kts
```

## System Requirements
- Android 7.0+ (API 24)
- 100MB storage
- Internet connection

## Next Development Steps
1. Add food database integration
2. Implement nutrition calculations
3. Add data visualization charts
4. Create backend API
5. Add user authentication
6. Implement notifications
7. Release on Google Play Store

# How to Build and Install Crown APK

## 📱 Easiest Way - Using Android Studio

1. Download and open Android Studio
2. Click `File > Open Project`
3. Select the `Crown` folder
4. Wait for Gradle sync to complete
5. Click the green `Run` button (▶️)
6. Select your device or emulator
7. App installs and launches automatically

## 🛠️ Command Line Method

### Debug APK (For Testing)
```bash
# Navigate to project
cd Crown

# Build
./gradlew assembleDebug

# Install on connected device
adb install app/build/outputs/apk/debug/app-debug.apk
```

### Release APK (For Distribution)

**Step 1: Create Signing Key**
```bash
keytool -genkey -v -keystore crown.jks -keyalg RSA -keysize 2048 -validity 10000 -alias crown_key
```

**Step 2: Configure in app/build.gradle.kts**
Find the `buildTypes` section and update `release`:
```gradle
release {
    isMinifyEnabled = true
    proguardFiles(
        getDefaultProguardFile("proguard-android-optimize.txt"),
        "proguard-rules.pro"
    )
    signingConfig = signingConfigs.getByName("debug") // Change to release
}
```

**Step 3: Build**
```bash
./gradlew assembleRelease
```

APK location: `app/build/outputs/apk/release/app-release.apk`

## 📲 Installation Methods

### Method 1: Transfer via USB
1. Copy APK to phone via USB cable
2. Open file manager on phone
3. Tap APK file
4. Grant permissions
5. Launch app

### Method 2: Direct ADB Install
```bash
adb install -r app/build/outputs/apk/release/app-release.apk
```

### Method 3: Email or Cloud
1. Upload APK to Google Drive/OneDrive
2. Download on phone
3. Enable Unknown Sources in Settings
4. Tap to install

## 🔧 Troubleshooting

**Build fails**
```bash
./gradlew clean
./gradlew assembleDebug
```

**Installation fails**
- Enable Unknown Sources: Settings > Security > Unknown Sources
- Uninstall previous version
- Ensure 100MB free storage

**App crashes**
- Clear cache: Settings > Apps > Crown > Clear Cache
- Check minimum Android 7.0 requirement

## 📊 File Sizes
- Debug APK: 50-80 MB
- Release APK: 15-25 MB (optimized)

## ✨ Features
✅ Food portion tracking
✅ Nutrition calculation
✅ Daily meal categories
✅ Nutrition chart
✅ User profile
✅ 100% FREE - No payments

## 🚀 Next: Upload to Play Store
1. Build release APK
2. Create Google Play account
3. Upload APK
4. Fill store listing
5. Submit for review

Enjoy tracking your nutrition! 🎉

# Crown - Nutrition Tracking Android App

A free Android application for tracking food portions and daily nutrition intake, similar to HealthifyMe but without premium paywall.

## Features

### 📊 Nutrition Tracking
- **Food Portion Recognition**: Input food portions in grams
- **Nutritional Breakdown**: 
  - Protein
  - Fat
  - Fiber
  - Carbohydrates
  - Calories
- **Real-time Calculation**: Instant nutritional value computation

### 📅 Daily Diet Chart
- **Meal Categories**: Morning Breakfast, Lunch, Snacks, Dinner
- **Daily Overview**: Visual representation of daily intake
- **Eating Habits**: Track and analyze eating patterns
- **Nutritional Goals**: Monitor daily macro and calorie targets

### 🎯 User Management
- **Profile Creation**: Set personal nutrition goals
- **Goal Setting**: Daily macro and calorie targets
- **Progress Tracking**: Historical data and trends
- **No Premium Features**: All features are 100% free

## Tech Stack

### Frontend
- **Language**: Kotlin
- **Framework**: Android Jetpack
- **UI**: Jetpack Compose / Material Design 3
- **Database**: Room Database
- **Architecture**: MVVM + Clean Architecture

### Backend
- **Framework**: Spring Boot / Node.js
- **Database**: PostgreSQL / MongoDB
- **API**: RESTful API
- **Food Database**: Nutritional data integration

## Project Structure

```
Crown/
├── android/                    # Android Application
│   ├── app/
│   │   ├── src/
│   │   │   ├── main/
│   │   │   │   ├── java/com/crown/
│   │   │   │   │   ├── data/
│   │   │   │   │   │   ├── local/
│   │   │   │   │   │   ├── remote/
│   │   │   │   │   │   └── repository/
│   │   │   │   │   ├── domain/
│   │   │   │   │   │   ├── model/
│   │   │   │   │   │   └── usecase/
│   │   │   │   │   ├── presentation/
│   │   │   │   │   │   ├── ui/
│   │   │   │   │   │   ├── viewmodel/
│   │   │   │   │   │   └── screen/
│   │   │   │   │   └── utils/
│   │   │   │   ├── res/
│   │   │   │   └── AndroidManifest.xml
│   │   │   └── test/
│   │   ├── build.gradle.kts
│   │   └── proguard-rules.pro
│   └── settings.gradle.kts
├── backend/                    # Backend Server (Optional)
│   ├── src/
│   ├── pom.xml (Maven) or build.gradle.kts
│   └── docker-compose.yml
├── docs/                       # Documentation
│   ├── API.md
│   ├── SETUP.md
│   └── FEATURES.md
└── README.md
```

## Getting Started

### Prerequisites
- Android Studio Flamingo or later
- JDK 11+
- Gradle 8.0+
- Android SDK 21+ (Target 34+)

### Installation

1. Clone the repository:
```bash
git clone https://github.com/Shumit1455/Crown.git
cd Crown
```

2. Open in Android Studio:
```bash
android-studio android/ &
```

3. Build and run:
```bash
./gradlew build
./gradlew installDebug
```

## Development Roadmap

- [ ] Setup Android project with Jetpack Compose
- [ ] Design data models (Food, Meal, User, NutritionData)
- [ ] Implement Room Database
- [ ] Create UI screens (Home, Add Food, Daily Chart, Profile)
- [ ] Build food search and portion input
- [ ] Implement nutrition calculation engine
- [ ] Add daily chart visualization (Charts library)
- [ ] Create meal categorization logic
- [ ] Setup local backend API
- [ ] Add data persistence and sync
- [ ] Testing and optimization
- [ ] Beta APK generation
- [ ] Release APK with play store signing

## API Endpoints (Backend)

```
POST   /api/auth/register          - User registration
POST   /api/auth/login             - User login
GET    /api/foods                  - Search food database
POST   /api/meals                  - Add meal entry
GET    /api/meals/today            - Get today's meals
GET    /api/nutrition/daily        - Get daily nutrition stats
PUT    /api/user/goals             - Update nutrition goals
```

## Contributing

Contributions are welcome! Please follow the development roadmap.

## License

This project is open-source and free to use. No premium features.

## Support

For issues, feature requests, or questions, please open an issue on GitHub.

---

**Status**: 🚀 Project Initialization Phase


# Number Guessing Game Documentation


Sample solution for the [number-guessing-game](https://roadmap.sh/projects/number-guessing-game) challenge from [roadmap.sh](https://roadmap.sh/)

## Project Overview

**Number guessing game** is a simple Spring Boot-based application designed for Number guessing game. 
It is a simple number guessing game built through a **command-line interface (CLI)** where the computer randomly selects a number and the user has to guess it. The user will be given a limited number of chances to guess the number. If the user guesses the number correctly, the game will end, and the user will win. Otherwise, the game will continue until the user runs out of chances.

---

## Features

- **Random number generation within a user-defined range.**
- **Feedback after each guess to guide the player.**
- Tracks the number of attempts taken to guess the correct number.
- Option to play multiple rounds.

---

## Prerequisites

Ensure you have the following installed:

- **Java 17** or higher
- **Maven** or **Gradle** for build management
- **Spring Boot** dependencies
- **GraalVM** (for native build)

---

## Installation

### Clone the Repository
```bash
git clone https://github.com/sukrut57/number-guessing-game.git
cd number-guessing-game
```

### Build the Project

#### Using Maven
```bash
./mvnw clean install
```

#### Using Gradle
```bash
./gradlew clean build
```

---
## Usage

Once the application is set up, you can interact with it using various commands.

### Available Commands

1. **start**:
  To start the game.
   ```bash
   task-cli start
   ```
---

## File Structure

```
number-quessing-game/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── numberguessinggame/
│   │               ├── NumberGuessingGame.java  # Main application entry point
│   │               ├── commands
│   │               │   └── GameComponent.java        # Command to add a new task
|   |               |   └── WelcomeComponent.java     # Welcome page for game introduction
│   │               
│   └── resources/
│       └── application.properties                 # Configuration properties
├── build.gradle                               # Gradle build configuration
└── README.md                                  # Project documentation
```

---

## Development

### Running the Application

1. **Run with Spring Boot**:
   ```bash
   ./gradlew bootRun     # Gradle
   ./mvnw spring-boot:run   # Maven
   ```

2. **Run the Native Executable** (if using GraalVM):
   After building the native executable:
   ```bash
   build/native/nativeCompile/number-guessing-game.exe
   ```

---

## Contributing

Feel free to fork the repository and submit pull requests. For major changes, please open an issue first to discuss what you would like to change.

---

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

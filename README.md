## License and Distribution

This project is licensed under the **Apache License 2.0**. 

You are permitted to distribute modified versions of this software, provided that you adhere to the following conditions:
1. **Attribution:** You must provide appropriate credit to the original author (Miki85cz).
2. **State Changes:** You must include a prominent notice in any modified files stating that you changed the files and detailing the modifications made.

For the full license text, please refer to the `LICENSE` file in the root repository or visit the [Apache License 2.0 page](https://www.apache.org/licenses/LICENSE-2.0).

## Installation and Setup

This repository contains the source code for Bedrockite. Follow the instructions below to set up the development environment:

1. **Clone the Repository:** Clone this repository to your local machine using Git or download the source files directly.
2. **Open in IDE:** Import the project into your preferred Integrated Development Environment (IDE). IntelliJ IDEA or Eclipse are highly recommended for Minecraft mod development.
3. **Environment Sync:** Allow Gradle to import and sync all required dependencies. 

### Troubleshooting & Maintenance
If you encounter missing libraries or dependency issues during setup, run the following Gradle commands in your terminal:
* Force a dependency refresh: `gradlew --refresh-dependencies`
* Reset the build cache (safe for your code): `gradlew clean`

## Technical Details

### Mapping Names
By default, this project is configured using official Mojang mapping names for methods and fields within the Minecraft codebase. These mappings are subject to specific licensing terms. For the latest license text, refer to the mapping file itself or the reference copy hosted by NeoForged:
* [Mojang Mapping License](https://github.com/NeoForged/NeoForm/blob/main/Mojang.md)

## Additional Resources

For further assistance, documentation, or community support, please refer to the links below:
* **NeoForged Documentation:** [https://docs.neoforged.net/](https://docs.neoforged.net/)
* **NeoForged Discord Community:** [https://discord.neoforged.net/](https://discord.neoforged.net/)

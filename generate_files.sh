#!/usr/bin/env sh

## Compress data pack
rm ".\build\phoenix-datapack.zip"
"C:\Program Files\7-Zip\7z" a ".\build\phoenix-datapack.zip" ".\datapack\*" ".\README.md" ".\LICENSE"

# Generate modpack jars
./gradlew build
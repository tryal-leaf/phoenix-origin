#!/usr/bin/env sh

# Compress data pack
VERSION="1.0.3"
rm -rf ./build/libs/phoenix-datapack-$VERSION.zip
"C:\Program Files\7-Zip\7z" a ".\build\libs\phoenix-datapack-$VERSION.zip" ".\datapack\*" ".\README.md" ".\LICENSE"

# Generate modpack jars
./gradlew build
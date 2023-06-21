#!/bin/bash

# Directorio actual
current_directory=$(pwd)

# Directorio "bin"
bin_directory="$current_directory/bin"

# Crear el directorio "bin" si no existe
mkdir -p "$bin_directory"

# Mover archivos con la extensión ".class" al directorio "bin"
for file in *.class; do
    if [ -f "$file" ]; then
        mv "$file" "$bin_directory"
        echo "Se movió el archivo $file a la carpeta 'bin'."
    fi
done


#!/bin/bash

set -e

echo "---------------------------------------"
echo "  Ejecutando pruebas + Allure History  "
echo "---------------------------------------"

# 1. Ejecutar tests
echo "[1/3] Ejecutando mvn test..."
mvn test

# 2. Copiar history (si existe)
if [ -d "target/allure-report/history" ]; then
    echo "[2/3] Copiando history previo..."
    mkdir -p target/allure-results/history
    cp -R target/allure-report/history/* target/allure-results/history/
else
    echo "[2/3] No existe history previo (primera ejecución)."
fi

# 3. Generar reporte
echo "[3/3] Generando reporte Allure..."
mvn allure:report

echo "✔ PROCESO COMPLETADO"
echo "Ejecuta ahora: mvn allure:serve"
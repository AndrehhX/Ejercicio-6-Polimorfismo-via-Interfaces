# Ejercicio 6: Polimorfismo vía Interfaces

Prototipo de consola en Java para administrar integraciones de pago, logística y certificación FEL. Usa una lista polimórfica, contratos mediante interfaces y separación MVC.

## Requisitos

- Java 8 o superior.

## Ejecutar

Desde la carpeta raíz del proyecto, en PowerShell:

```powershell
New-Item -ItemType Directory -Force out
javac -encoding UTF-8 -d out (Get-ChildItem -Recurse src/main/java -Filter *.java | ForEach-Object FullName)
java -cp out gt.uvg.poo.ejercicio6.Main
```

El menú permite listar conexiones activas, consultar una integración por identificador y ordenar el catálogo por latencia. El reintegro solicitado a un proveedor logístico se ignora de forma controlada.

Las conexiones son datos de ejemplo; el prototipo no llama servicios reales. El diseño UML está en `docs/diseno-uml.pdf`.

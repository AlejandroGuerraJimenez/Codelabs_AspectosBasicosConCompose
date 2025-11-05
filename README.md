# Aspectos Básicos con Compose

## Estructura del repositorio

En este repositorio hay dentro varios proyectos y estan distribuidos de la siguiente forma:
````
  Aspectos basicos con Compose:
              |
              |--> Tu primera app para android
                                |
                                |--> Crea un diseño basico
                                |             |
                                |             |--> HappyBirthay (Proyecto)
                                |             |
                                |             |--> PresentationCard (Proyecto)
                                |
                                |
                                |--> Introduccion a Kotlin
                                              |
                                              |--> Como crear y usar funciones en kotlin (Proyecto)
                                              |
                                              |--> Crea y usa variables en Kotlin (Proyecto)
                                              |
                                              |--> Problemas Practicos (Proyecto)
                                              |
                                              |--> Tu primer programa en Kotlin (Proyecto)
````
## Introducción a Kotlin

### Como crear y usar funciones en Kotlin

#### Características
- Una serie de ejercicios básicos en kotlin relacionados con la creación y el uso de funciones en Kotlin
- Los ejercicios estan todos en el mismo fichero 'MainActivity.kt' cada uno desarrollado en una función
- Las llamadas a las funciones solucion a los ejercicios se encuentran en la función main comentadas

### Crea y usa variables en Kotlin

#### Características

- Una serie de ejercicios básicos en kotlin relacionados con la creación y el uso de variables en Kotlin
- Los ejercicios estan todos en el mismo fichero 'MainActivity.kt' cada uno desarrollado en una función
- Las llamadas a las funciones solucion a los ejercicios se encuentran en la función main comentadas

### Tu primer programa en Kotlin

#### Características

- Un programa sencillo en Kotlin que nos enseña como mostrar mensajes por terminal
- Los ejercicios estan todos en el mismo fichero 'MainActivity.kt' cada uno desarrollado en una función
- Las llamadas a las funciones solucion a los ejercicios se encuentran en la función main comentadas

### Problemas practicos

#### Características

- Una serie de ejercicios que estan relacionados con 'Como crear y usar funciones en Kotlin', 'Crea y usa variables en kotlin' y 'Tu primer programa en Kotlin'
- Los ejercicios estan todos en el mismo fichero 'MainActivity.kt' cada uno desarrollado en una función
- Las llamadas a las funciones solucion a los ejercicios se encuentran en la función main

---

## Crea un diseño básico

### Happy Birthday Card App

Aplicación Android creada con **Kotlin** y **Jetpack Compose**, diseñada para mostrar una tarjeta de cumpleaños con imagen de fondo y texto superpuesto.

---

#### Características

- UI construida completamente con **Jetpack Compose**
- Imagen de fondo con superposición de texto
- Uso de recursos `stringResource` para soporte multi-idioma
- Vista previa integrada en Android Studio

---

#### ¿Cómo funciona?

La app está compuesta por tres elementos principales:

##### `MainActivity`
- Inicializa la aplicación y muestra el contenido envuelto en el tema `HappyBirthdayTheme`.
- Utiliza un `Surface` como contenedor principal.
- Llama al composable `GreetingImage`, enviando el texto del mensaje y la firma.

##### `GreetingText(message, from)`
- Muestra el mensaje de cumpleaños y quién lo envía.
- Usa una columna vertical para evitar la superposición del texto.
- El mensaje se centra y la firma se alinea a la derecha.

##### `GreetingImage(message, from)`
- Muestra una imagen de fondo usando un `Box` para superponer texto encima.
- La imagen se hace semitransparente (alpha = 0.5) para una mejor lectura del mensaje.
- Llama internamente a `GreetingText`.

---

#### Captura de Pantalla

<img width="251" height="512" alt="image" src="https://github.com/user-attachments/assets/ae2d748e-a7d8-4dc5-b1ee-0371ace0e134" />

---

#### Personalización

Puedes cambiar el mensaje y la firma modificando los recursos de strings o directamente en el composable:

```kotlin
GreetingImage(
    message = "¡Feliz Cumpleaños!",
    from = "De: Tu Nombre"
)
```

### Presentation Card App

Una sencilla aplicación Android desarrollada con **Kotlin** y **Jetpack Compose** que muestra una tarjeta de presentación con información personal y datos de contacto.

---

#### Características

- Interfaz construida con **Jetpack Compose**
- Diseño minimalista y centrado en pantalla
- Iconos representativos para cada dato de contacto
- Composable reutilizable para mostrar información

---

#### ¿Cómo funciona?

La app se compone de tres partes principales:

##### `MainActivity`
- Inicia la interfaz usando `setContent`
- Envuelve el contenido dentro del tema `PresentationCardTheme`
- Muestra un `Surface` con fondo blanco

##### `PresentationCardTheme()`
- Contiene el diseño principal de la tarjeta
- Muestra:
  - Icono de usuario
  - Nombre y ocupación
  - Información de contacto

##### `ContactInfo(icon, info)`
- Componente reutilizable que muestra un ícono junto a un texto informativo
- Se usa para teléfono, redes sociales y correo

---

#### Captura de Pantalla

<img width="469" height="959" alt="image" src="https://github.com/user-attachments/assets/e9d444cf-2ba1-43ca-a377-d3399386b623" />

---

#### Cómo personalizar

Modifica los siguientes campos en `PresentationCardTheme()` para añadir tus datos:

```kotlin
Text(text = "Tu Nombre")
Text(text = "Tu cargo o profesión")
ContactInfo(icon = Icons.Default.Call, info = "Tu número")
ContactInfo(icon = Icons.Default.Share, info = "Tus redes sociales")
ContactInfo(icon = Icons.Default.Email, info = "Tu correo")
````

--- 

## Tecnologías utilizadas

| Tecnología | Uso |
|------------|------|
| Kotlin | Lenguaje de programación |
| Jetpack Compose | Creación de la UI declarativa |
| Material Icons | Íconos para información de contacto |
---

## Autor

**Alejandro Guerra Jimenez**  
📧 Email: alejandroguerraj013@gmail.com

🔗 GitHub: [Alejandro-Guerra-Jimenez](https://github.com/Alejandro-Guerra-Jimenez)

🔗 GitHub: [AlejandroGuerraJimenez](https://github.com/AlejandroGuerraJimenez)


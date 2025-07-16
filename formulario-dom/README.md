# Desafío: Manipulación del DOM en un Formulario de Hotel

## 1. Crear el Archivo HTML para el Formulario del Hotel

- Crea una carpeta llamada `formulario-DOM` en la raíz del proyecto.
- Dentro de la carpeta `formulario-DOM`, crea un archivo llamado `index.html`.
- Asegúrate de que el archivo HTML esté correctamente vinculado a un archivo CSS y JavaScript.

## 2. Estructura del Formulario

El formulario debe tener los siguientes campos:

- Nombre (input de texto)
- Correo electrónico (input de email)
- Fecha de llegada (input de fecha)
- Fecha de salida (input de fecha)
- Tipo de habitación (select con opciones: Individual, Doble, Suite)
- Botón de envío

## 3. Manipulación del DOM con JavaScript

- Crea un archivo llamado `script.js` en la carpeta `formulario-DOM`.
- Usa JavaScript para realizar las siguientes manipulaciones:

  1. Cambiar el texto del botón de envío a "Reservar Ahora".
  2. Añadir un evento `click` al botón de envío que muestre una alerta con un mensaje confirmando la reserva con el nombre de la persona, la fecha de llegada y el tipo de habitación.
  3. Cambiar el color del botón de envío del formulario cuando el usuario pase el cursor sobre él (`mouseover`) y cuando lo aleje (`mouseout`).
  4. Validar que los campos de fecha de llegada y salida no estén vacíos antes de enviar el formulario.

## 4. Estilos con CSS

- Crea un archivo llamado `styles.css` en la carpeta `formulario-DOM`.
- Aplica los siguientes estilos:

  1. Usa **Flexbox** para centrar el formulario en la página.
  2. Añade un fondo de color y bordes redondeados al formulario.
  3. Estiliza los inputs y el botón para que se vean modernos y atractivos.
  4. Añade un efecto de sombra al formulario cuando el usuario pase el cursor sobre él.
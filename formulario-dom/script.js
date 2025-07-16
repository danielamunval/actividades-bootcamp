// 1. Cambiar texto del botón
const boton = document.getElementById("boton-enviar");
boton.textContent = "Reservar Ahora";

// 2. Evento de click para confirmar la reserva, imprimiendo datos de reserva
// 4. Validar que los campos de fecha de llegada y salida no estén vacíos antes de enviar el formulario.
document.getElementById("reserva-form").addEventListener("submit", function (e) {
  e.preventDefault(); 
  
  // Evita que se envíe el formulario automáticamente
  const nombre = document.getElementById("nombre").value.trim();
  const llegada = document.getElementById("llegada").value;
  const salida = document.getElementById("salida").value;
  const habitacion = document.getElementById("habitacion").value;

  // Validación de fechas registradas.
  if (!llegada || !salida) {
    alert("Por favor, completa las fechas de llegada y salida.");
    return;
  }

  alert(`¡Reserva confirmada!\nNombre: ${nombre}\nLlegada: ${llegada}\nHabitación: ${habitacion}`);
});

// 3. Cambiar color del botón con `mouseover` y `mouseout`
boton.addEventListener("mouseover", () => {
  boton.style.backgroundColor = "#1e88e5";
});

boton.addEventListener("mouseout", () => {
  boton.style.backgroundColor = "#3f51b5";
});

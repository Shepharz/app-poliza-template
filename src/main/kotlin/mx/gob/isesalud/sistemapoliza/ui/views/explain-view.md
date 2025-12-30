# 🎬 UI / View

## Descripción
Componentes visuales reutilizables y utilidades para la interfaz gráfica.

## Estructura

```
view/
├── components/              [Widgets custom]
│   └── Botones, campos personalizados, etc.
├── util/                    [Utilidades de vista]
│   └── AlertManager, ThemeManager, etc.
└── explain-view
```

## 📦 Tipos de Componentes

### Components
Son **widgets reutilizables**. Ejemplos:
- `CustomButton.kt` - Botón con estilo personalizado
- `SearchBar.kt` - Barra de búsqueda
- `DataTable.kt` - Tabla de datos
- `FormPanel.kt` - Panel para formularios

**Regla:** Si lo usarás en 2+ vistas, hazlo un componente.

### Util
Son **funciones auxiliares** de vista. Ejemplos:
- `AlertManager.kt` - Mostrar alertas (error, éxito, info)
- `ThemeManager.kt` - Cambiar tema claro/oscuro
- `DialogHelper.kt` - Diálogos comunes
- `ValidatorUI.kt` - Validaciones visuales

**Regla:** Si varias vistas necesitan la misma funcionalidad, hazla una utilidad.

## 💡 Ejemplos

### AlertManager.kt
```kotlin
object AlertManager {
    fun mostrarError(titulo: String, mensaje: String) {
        val alerta = Alert(Alert.AlertType.ERROR)
        alerta.title = titulo
        alerta.contentText = mensaje
        alerta.showAndWait()
    }
    
    fun mostrarExito(mensaje: String) { /* ... */ }
}
```

**Uso desde controlador:**
```kotlin
class UsuarioController {
    private fun guardarUsuario() {
        try {
            userService.save(usuario)
            AlertManager.mostrarExito("Usuario guardado")
        } catch (e: Exception) {
            AlertManager.mostrarError("Error", e.message)
        }
    }
}
```

## 🎯 Reglas
- ✓ Componentes deben ser **independientes**
- ✓ Aceptan parámetros, no estado global
- ✓ Utilidades son **static** u **object** (singletons)
- ❌ No hagas llamadas a BD desde aquí
- ❌ No pongas lógica compleja

---
**Tipo:** Componentes UI | **Editable:** Sí | **Generado:** No


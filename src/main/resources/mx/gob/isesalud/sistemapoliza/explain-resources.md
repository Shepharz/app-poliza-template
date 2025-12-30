# 📦 Resources

## Descripción
Contiene todos los archivos estáticos no compilables: FXML, CSS, imágenes, configuración.

## Estructura

```
resources/
├── css/                     [Hojas de estilo]
│   ├── styles.css
│   ├── dark-theme.css
│   └── explain-css
├── fxml/                    [Vistas (XML))]
│   ├── main-view.fxml
│   ├── dialogs/
│   └── explain-fxml
├── images/                  [Imágenes e iconos]
│   ├── icons/
│   ├── backgrounds/
│   └── explain-images
├── config/                  [Archivos de configuración]
│   ├── application.properties
│   ├── db/
│   └── explain-config
└── explain-resources
```

## 📋 Contenido

### CSS
Estilos para la interfaz
- `styles.css` - Estilos principales
- `dark-theme.css` - Tema oscuro
- `light-theme.css` - Tema claro

### FXML
Definición de vistas en XML
- `main-view.fxml` - Ventana principal
- `dialogs/` - Diálogos reutilizables
- `panels/` - Paneles componibles

### Images
Recursos visuales
- `icons/` - Iconos (16x16, 32x32, etc.)
- `backgrounds/` - Fondos
- `logos/` - Logo de la aplicación

### Config
Configuración centralizada
- `application.properties` - Propiedades
- `db/` - Scripts SQL
- `messages/` - Mensajes i18n

## 💡 Ejemplos

### Acceder a Recurso desde Kotlin
```kotlin
// FXML
val fxmlLoader = FXMLLoader(javaClass.getResource("/fxml/main-view.fxml"))

// Imagen
val imagen = Image(javaClass.getResourceAsStream("/images/logo.png"))

// CSS
scene.stylesheets.add(javaClass.getResource("/css/styles.css").toExternalForm())

// Propiedades
val props = Properties()
props.load(javaClass.getResourceAsStream("/config/application.properties"))
```

## 🎯 Reglas
- ✓ Estructura espejo al código Kotlin
- ✓ Ruta relativa: `/mx/gob/isesalud/example/`
- ✓ Nombres en minúsculas con guiones: `main-view.fxml`
- ✓ Organiza por tipo, no por página
- ❌ No pongas código compilable
- ❌ No mezcles tipos (CSS con imágenes)

## 📊 Recomendaciones

### Nomenclatura
```
✓ main-view.fxml        (descripción-tipo)
✓ icon-user.png         (rol-descriptivo)
✓ application.properties (específico)
❌ view.fxml            (muy genérico)
❌ img1.png             (sin descripción)
```

### Tamaños de Imagen
```
Icons:  16x16, 24x24, 32x32, 48x48
Logo:   256x256, 512x512
Banner: 1200x400
```

---
**Tipo:** Recursos Estáticos | **Editable:** Sí | **Generado:** No


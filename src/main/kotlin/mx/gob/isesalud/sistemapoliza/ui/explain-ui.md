# 🎮 UI (User Interface)

## Descripción
Capa de presentación. Contiene todos los elementos visuales, controladores FXML y utilidades de interfaz.

## Propósito
- Mostrar datos al usuario
- Capturar interacciones del usuario
- Gestionar el flujo visual

## Estructura

```
ui/
├── controller/              [Controladores FXML]
│   └── Gestiona eventos y lógica de vistas
├── view/                    [Componentes visuales reutilizables]
│   ├── components/          [Widgets custom]
│   └── util/                [Utilidades como AlertManager]
└── style/                   [Gestión de temas CSS]
```

## 🔗 Responsabilidades

### Controller
- Enlazar vistas FXML con lógica
- Manejar eventos de botones, inputs
- Mostrar/actualizar datos en pantalla

### View
- Componentes reutilizables (ej: CustomButton)
- Diálogos, alertas, notificaciones

### Style
- Gestión centralizada de CSS
- Temas (claro/oscuro)

## 💡 Ejemplos

### ✅ CORRECTO - Colocar aquí:
```
- HelloController.kt (maneja hello-view.fxml)
- AlertManager.kt (muestra alertas)
- CustomButton.kt (botón personalizado)
- ThemeManager.kt (gestiona temas CSS)
```

### ❌ INCORRECTO - NO colocar aquí:
```
- UserService.kt (va en business/)
- Database.kt (va en data/)
- UserModel.kt (va en model/)
```

## 📊 Dependencias
```
┌─────────────┐
│ UI/View     │
│ (esta capa) │
└──────┬──────┘
       ↓
┌─────────────┐
│  Business   │
│  (Services) │
└──────┬──────┘
       ↓
┌─────────────┐
│  Data       │
│ (Repository)│
└─────────────┘
```

## 🎯 Reglas
- ✓ Usa DataBinding para actualizar vistas
- ✓ Inyecta servicios en controladores
- ✓ Reutiliza componentes visuales
- ❌ No hagas peticiones HTTP aquí directamente
- ❌ No accedas a BD directamente
- ❌ No pongas lógica de negocio pesada

---
**Tipo:** Presentación | **Editable:** Sí | **Generado:** No


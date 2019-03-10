package example

interface Event
class MouseEvent : Event
class KeyboardEvent : Event

fun onEvent(event: Event) {}

fun main(args: Array<String>) {
    onEvent(MouseEvent())

    val onEvents: MutableMap<String, (Event) -> Unit> = mutableMapOf()

    // Can't be `MouseEvent`
    onEvents["click"] = { event: Event -> }

}


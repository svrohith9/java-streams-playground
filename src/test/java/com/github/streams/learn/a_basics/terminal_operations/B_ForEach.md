# Data Set

```java
enum Guild { RANGERS, MYSTICS }

record Explorer(String name, int age, Guild guild, List<String> skills) {}

List<Explorer> getExplorers() {
    return List.of(
            new Explorer("Kael",   32, Guild.RANGERS, List.of("Tracking", "Archery", "Climbing")),
            new Explorer("Doran",  28, Guild.RANGERS, List.of("Tracking", "Archery", "Foraging")),
            new Explorer("Bram",   23, Guild.RANGERS, List.of("Climbing", "Archery")),
            new Explorer("Theron", 27, Guild.RANGERS, List.of("Diving")),
            new Explorer("Idris",  20, Guild.RANGERS, List.of("Climbing", "Cartography")),
            new Explorer("Lyra",   29, Guild.MYSTICS, List.of("Tracking", "Archery")),
            new Explorer("Mira",   17, Guild.MYSTICS, List.of("Runecraft")),
            new Explorer("Senna",  25, Guild.MYSTICS, List.of("Archery", "Diving", "Foraging")));
}
```

# For Each

`forEach` performs an action on every element. On a **parallel** stream it makes no ordering
guarantee — actions may run on different threads in any order. If order matters, see `forEachOrdered`.

```java
List.of(5, 2, 8, 9, 21, 3, 4, 72, 55).parallelStream()
        .filter(number -> number < 60)
        .forEach(number -> System.out.println("number = " + number));
// Prints 5, 2, 8, 9, 21, 3, 4, 55 in an unspecified order (it varies run to run).
```

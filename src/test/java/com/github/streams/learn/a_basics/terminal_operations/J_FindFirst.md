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

# Find First

`findFirst` returns an `Optional` holding the first element in encounter order (or empty if none).
Even on a parallel stream it respects ordering, so the result is deterministic.

```java
int firstOverFive = List.of(9, 2, 5, 11, 4, 8, 3, 30, 17, 21).parallelStream()
        .filter(number -> number > 5)
        .findFirst()
        .orElseThrow();

System.out.println("firstOverFive = " + firstOverFive);
// firstOverFive = 9
```

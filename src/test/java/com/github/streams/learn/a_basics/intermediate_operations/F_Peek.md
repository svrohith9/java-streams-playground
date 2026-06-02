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

# Peek

`peek` lets you observe each element as it flows past — without changing it — and returns the same
stream. It is meant for debugging/logging, not for side effects your program depends on.

```java
long rangerCount = explorers.stream()
        .filter(explorer -> explorer.guild() == Guild.RANGERS)
        .sorted(Comparator.comparing(Explorer::age))
        .peek(explorer -> System.out.println("visiting = " + explorer.name()))
        .count();

System.out.println("rangerCount = " + rangerCount);
// visiting = Idris
// visiting = Bram
// visiting = Theron
// visiting = Doran
// visiting = Kael
// rangerCount = 5
```

> ⚠️ Because `peek` exists only for its side effect, some terminal operations may skip it when the
> result can be computed without traversing every element. Never rely on it for real work.

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

# Collect

`collect` is the most flexible terminal operation: it accumulates elements into a container or summary
using a `Collector`. `Collectors` offers ready-made recipes — `toList`, `toSet`, `groupingBy`,
`joining`, `partitioningBy`, and many more.

```java
List<Explorer> veteranMystics = explorers.stream()
        .filter(explorer -> explorer.guild() == Guild.MYSTICS)
        .filter(explorer -> explorer.age() > 23)
        .collect(Collectors.toList());
// veteranMystics = [Lyra (MYSTICS), Senna (MYSTICS)]

// Group every explorer by guild in one pass:
Map<Guild, List<Explorer>> byGuild = explorers.stream()
        .collect(Collectors.groupingBy(Explorer::guild));
```

> 💡 Since Java 16, `stream().toList()` is a concise shortcut for `collect(Collectors.toList())`
> when you just need an unmodifiable list.

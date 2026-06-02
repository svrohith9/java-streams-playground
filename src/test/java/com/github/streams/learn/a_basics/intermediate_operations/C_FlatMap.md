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

# FlatMap

When each element itself holds a collection (here `List<String>` of skills), the stream is nested —
`Stream<List<String>>`. `flatMap` flattens those inner collections into a single stream of elements
so you can keep chaining.

#### Example: list every skill held by Rangers under 30 (duplicates kept).

```java
String rangerSkills = explorers.stream()
        .filter(explorer -> explorer.guild() == Guild.RANGERS)
        .filter(explorer -> explorer.age() < 30)
        .map(Explorer::skills)
        .flatMap(Collection::stream)
        .collect(Collectors.joining(","));
```

#### Output:

```
rangerSkills = Tracking,Archery,Foraging,Climbing,Archery,Diving,Climbing,Cartography
```

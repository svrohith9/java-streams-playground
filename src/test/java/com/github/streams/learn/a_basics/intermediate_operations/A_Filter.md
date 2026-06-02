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

# Filter

`filter` keeps only the elements that satisfy a predicate and discards the rest. The stream that
comes out is never larger than the one that went in.

#### Example: every Mystic older than 23.

```java
List<Explorer> veteranMystics = explorers.stream()
        .filter(explorer -> explorer.guild() == Guild.MYSTICS)
        .filter(explorer -> explorer.age() > 23)
        .toList();
```

#### Output:

```
Explorer[name=Lyra, age=29, guild=MYSTICS, skills=[Tracking, Archery]]
Explorer[name=Senna, age=25, guild=MYSTICS, skills=[Archery, Diving, Foraging]]
```

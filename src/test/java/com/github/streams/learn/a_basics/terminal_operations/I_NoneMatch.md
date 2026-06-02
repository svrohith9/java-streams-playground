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

# None Match

`noneMatch` returns `true` when **no** element satisfies the predicate — the logical opposite of
`anyMatch`. It too short-circuits on the first match.

```java
boolean noImmortals = explorers.stream()
        .noneMatch(explorer -> explorer.age() > 100);

System.out.println("noImmortals = " + noImmortals);
// noImmortals = true   (nobody is older than 100)
```

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

# To Array

When you need a plain array instead of a stream, `toArray` does the job. Passing the array
constructor reference (`Explorer[]::new`) gives you a typed array rather than `Object[]`.

```java
Explorer[] mystics = explorers.stream()
        .filter(explorer -> explorer.guild() == Guild.MYSTICS)
        .toArray(Explorer[]::new);

System.out.println("mystics = " + Arrays.toString(mystics));
// mystics = [Lyra (MYSTICS), Mira (MYSTICS), Senna (MYSTICS)]
```

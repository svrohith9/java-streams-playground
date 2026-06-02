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

# Distinct

`distinct` removes duplicate elements, keeping the first occurrence of each. Equality is decided by
the element's `equals` method, so for records it compares every component.

#### Example: the unique set of skills held by Rangers under 30.

```java
String uniqueRangerSkills = explorers.stream()
        .filter(explorer -> explorer.guild() == Guild.RANGERS)
        .filter(explorer -> explorer.age() < 30)
        .map(Explorer::skills)
        .flatMap(Collection::stream)
        .distinct()
        .collect(Collectors.joining(","));
```

#### Output:

```
uniqueRangerSkills = Tracking,Archery,Foraging,Climbing,Diving,Cartography
```

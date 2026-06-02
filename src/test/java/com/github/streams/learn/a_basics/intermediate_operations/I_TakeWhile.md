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

# Take While (Java 9+)

`takeWhile` keeps elements from the start of the stream **as long as** the predicate holds, then
stops at the first element that fails — unlike `filter`, which tests every element. The difference is
clearest on an ordered stream:

```java
// filter tests EVERY element
List<Integer> filtered = Stream.of(2, 4, 6, 8, 9, 10, 11, 12)
        .filter(n -> n % 2 == 0)
        .toList();
// filtered = [2, 4, 6, 8, 10, 12]

// takeWhile STOPS at the first odd number (9)
List<Integer> taken = Stream.of(2, 4, 6, 8, 9, 10, 11, 12)
        .takeWhile(n -> n % 2 == 0)
        .toList();
// taken = [2, 4, 6, 8]
```

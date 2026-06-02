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

# Drop While (Java 9+)

`dropWhile` is the complement of `takeWhile`: it discards the leading elements **while** the predicate
holds, then emits everything from the first failing element onward — including later elements that
would have passed the predicate.

```java
List<Integer> dropped = Stream.of(2, 4, 6, 8, 9, 10, 11, 12)
        .dropWhile(n -> n % 2 == 0)
        .toList();
// dropped = [9, 10, 11, 12]
// (the leading evens 2,4,6,8 are dropped; everything from 9 onward is kept)
```

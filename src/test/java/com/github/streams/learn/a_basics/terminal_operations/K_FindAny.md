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

# Find Any

`findAny` returns *some* matching element wrapped in an `Optional`. On a parallel stream it lets the
runtime hand back whichever match a thread finds first, so it can be faster than `findFirst` when you
do not care which element you get.

```java
int someOverFive = List.of(9, 2, 5, 11, 4, 8, 3, 30, 17, 21).parallelStream()
        .filter(number -> number > 5)
        .findAny()
        .orElseThrow();

System.out.println("someOverFive = " + someOverFive);
// someOverFive = 30   (any value > 5 is valid; the exact one may vary)
```

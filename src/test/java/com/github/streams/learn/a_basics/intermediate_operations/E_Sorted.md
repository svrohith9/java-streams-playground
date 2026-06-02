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

# Sorted

`sorted` reorders the stream. With no argument it uses natural ordering; pass a `Comparator` to sort
by any key — and chain `thenComparing` to break ties.

#### Example: sort by guild, then alphabetically by name within each guild.

```java
List<Explorer> byGuildThenName = explorers.stream()
        .sorted(Comparator.comparing(Explorer::guild).thenComparing(Explorer::name))
        .toList();
```

#### Output:

```
Bram   (RANGERS)
Doran  (RANGERS)
Idris  (RANGERS)
Kael   (RANGERS)
Theron (RANGERS)
Lyra   (MYSTICS)
Mira   (MYSTICS)
Senna  (MYSTICS)
```

> `Comparator.comparing(Explorer::guild)` orders by the enum's declaration order, so `RANGERS`
> (declared first) comes before `MYSTICS`.

# RNA Transcription

Given a DNA strand, return its RNA complement (per RNA transcription).

Both DNA and RNA strands are a sequence of nucleotides.

The four nucleotides found in DNA are adenine (**A**), cytosine (**C**),
guanine (**G**) and thymine (**T**).

The four nucleotides found in RNA are adenine (**A**), cytosine (**C**),
guanine (**G**) and uracil (**U**).

Given a DNA strand, its transcribed RNA strand is formed by replacing
each nucleotide with its complement:

* `G` -> `C`
* `C` -> `G`
* `T` -> `A`
* `A` -> `U`

## Setup

Go through the setup instructions for Java to install the necessary
dependencies:

[https://exercism.io/tracks/java/installation](https://exercism.io/tracks/java/installation)

# Running the tests

You can run all the tests for an exercise by entering the following in your
terminal:

```sh
$ gradle test
```

> Use `gradlew.bat` if you're on Windows

In the test suites all tests but the first have been skipped.

Once you get a test passing, you can enable the next one by removing the
`@Ignore("Remove to run test")` annotation.

## Source

Hyperphysics [http://hyperphysics.phy-astr.gsu.edu/hbase/Organic/transcription.html](http://hyperphysics.phy-astr.gsu.edu/hbase/Organic/transcription.html)

## Submitting Solutions
 1. You are expected to commit the source code in a public github repository shared with your trainers via slack.
 2. It is expected that all code is unit tested. If you don't know about unit tests, don't worry - here is a friendly [blog](https://martinfowler.com/bliki/UnitTest.html) by Martin Fowler talking about unit testing. And you can take a look at  [junit's official guide](https://junit.org/junit5/docs/current/user-guide/) to efficiently write tests with same.
 3. We already have included `gradle` as the build tool. You can learn about it from [official documentation](https://gradle.org/guides/#getting-started). However be careful with the time you spend on it, as its quite exhaustive. It might be better to connect with people in your office who already worked with or know about gradle. Anyhow, `./gradlew test` should get you started for running tests. 

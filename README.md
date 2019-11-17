## Requirements ##

* JDK 8

## Building ##

As this project comes with a gradle wrapper, having Gradle installed is not nessesary. Instead pass
all gradle commands to gradlew (the file extension used will depend on what operating system you are on).

```
git clone https://github.com/alexocv/classroom-manager.git
gradlew build
```

## Classes ##
Class domain consists of :

```
org.classroom.domain // domain objects like Classroom, Student and Location
org.classroom.search // Functional behaviour for searching based on requirements
```

## Assumptions ##
There is no direction from each room, so even if it is a square, we can not known where it is direction.


## License ##

The content here is licensed under the [MIT License](https://opensource.org/licenses/MIT)



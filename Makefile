cc=javac

all: CountLetters.class

CountLetters.class: CountLetters.java
	${cc} CountLetters.java

clean:
	rm CountLetters.class

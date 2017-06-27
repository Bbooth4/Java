class Movie {
  private String name;

  public Movie(String name) {
    this.name = name; 
  }

  public String plot() {
    return "No plot here";
  }

  public String getName() {
    return name; 
  }
}

class Jaws extends Movie {
  public Jaws() {
    super("Jaws");
  }

  public String plot() {
    return "A shark eats lots of people";
  }
}

class IndependenceDay extends Movie {
  
  public IndependenceDay() {
    super("Independence Day");
  }

  // @Override
  public String plots() {
    return "Aliens try to take over earth";
  }
}

class MazeRunner extends Movie {
  public MazeRunner() {
    super("Maze Runner");
  }

  @Override
  public String plot() {
    return "Kids trapped in a maze";
  }
}

class StarWars extends Movie {
  public StarWars() {
    super("Star Wars");
  }

  @Override
  public String plot() {
    return "Space fantasy";
  }
}

class ForgettableMovie extends Movie {
  public ForgettableMovie() {
    super("Forgettable Movie");
  }

  // will return no plot here because it knows that there should be a plot based upon other similar classes
}

public class Main {
  public static void main(String[] args) {
    for(int i=1; i<11; i++) {
      Movie movie = randomMovie();
      System.out.println("Movie # " + i +
              " : " + movie.getName() + "\n" +
              "Plot: " + movie.plot() + "\n");
    }
  }

  public static Movie randomMovie() {
    int randomNumber = (int) (Math.random() * 5) + 1;
    System.out.println("Random number " + randomNumber);
    switch (randomNumber) {
      case 1: 
        return new Jaws();
      case 2: 
        return new IndependenceDay();
      case 3: 
        return new MazeRunner();
      case 4: 
        return new StarWars();
      case 5: 
        return new ForgettableMovie();
    }
    return null; 
  }
}
```groovy
def myMethod(String name) {
  if (name == null) {
    println "Name is null"
    return
  }
  println "Hello, $name!"
}

// safer method using safe navigation operator
def myMethodSafe(String name) {
  println "Hello, ${name?.toString()}!"
}

// even safer method using equals
def myMethodEquals(String name) {
  if (name != null && name.equals("Alice")) {
      println "Hello Alice"
  } else if (name == null) {
      println "Name is null"
  } else {
      println "Hello, $name!"
  }
}

myMethod(null)
myMethod("Alice")
myMethodSafe(null)
myMethodSafe("Alice")
myMethodEquals(null)
myMethodEquals("Alice")
myMethodEquals("Bob")
```
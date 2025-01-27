```groovy
def myMethod(String name) {
  if (name == null) {
    println "Name is null"
    return
  }
  println "Hello, $name!"
}

myMethod(null)
myMethod("Alice")
```
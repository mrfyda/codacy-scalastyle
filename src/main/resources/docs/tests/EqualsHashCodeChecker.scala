//#Patterns: EqualsHashCodeChecker

//#Err: EqualsHashCodeChecker
class EqualsHashCodeChecker {

  override def hashCode(): Int = 42

}

//#Err: EqualsHashCodeChecker
class AnotherEqualsHashCodeChecker {

  override def equals(x$1: Any): Boolean = true

}

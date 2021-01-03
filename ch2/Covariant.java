package ch2;

class Covariant extends Mid {
  @java.lang.Override
  ch2.Covariant method() {
    return null;
  }
}

class Top extends Mid {

  @java.lang.Override
  ch2.Mid method() {
    return null;
  }
}
class Mid extends Base {

  @java.lang.Override
  ch2.Mid method() {
    return null;
  }
}
class Base {

  Base method() {
    return null;
  }

}
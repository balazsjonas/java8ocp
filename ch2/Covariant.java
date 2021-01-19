package ch2;

class Covariant extends CovMid {
  @java.lang.Override
  ch2.Covariant method() {
    return null;
  }
}

class Top extends CovMid {

  @java.lang.Override
  CovMid method() {
    return null;
  }
}
class CovMid extends CovBase {

  @java.lang.Override
  CovMid method() {
    return null;
  }
}
class CovBase {

  CovBase method() {
    return null;
  }

}
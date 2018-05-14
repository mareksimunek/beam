package cz.seznam.euphoria.beam.window;

import cz.seznam.euphoria.core.client.dataset.windowing.Window;
import java.util.Objects;

/**
 * Window used as type parameter of {@link BeamWindowing}.
 */
final class UnsupportedWindow extends Window<UnsupportedWindow> {

  private UnsupportedWindow(){
    //Do not instantiate
  }

  @Override
  public int compareTo(UnsupportedWindow o) {
    throw new UnsupportedOperationException();
  }

  @Override
  public long maxTimestamp() {
    throw new UnsupportedOperationException();
  }

  @Override
  public int hashCode() {
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean equals(Object obj) {
    return Objects.equals(this, obj);
  }


}

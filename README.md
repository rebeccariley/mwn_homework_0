## Screen rotation findings ##

Upon rotating the screen, I found that the following lifecycle methods
were called (in this order):
  onPause()
  onStop()
  onDestroy()
  onCreate()
  onStart()
  onResume()

These six lifecycle methods were called in order for every screen
rotation.  It appears that rotating the screen actually completely
wipes the original lifecycle and creates a new lifecycle with a
different orientation rather than changing the orientation of the
original lifecycle.

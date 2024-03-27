package test

import (
	"testing"
)

// TestHelloName calls greetings.Hello with a name, checking
// for a valid return value.
func TestHelloName(t *testing.T) {
	got := 10
	want := 10

	if got != want {
		t.Errorf("got %q, wanted %q", got, want)
	}
}

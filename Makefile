PORT=3449

all:
	@cat Makefile

ancient:
	lein ancient

clean:
	lein clean

open-cards:
	open http://localhost:$(PORT)/cards.html

open:
	open resources/public/index.html

prod:
	lein cljsbuild once prod

repl:
	lein figwheel

# Run 'lein figwheel' and then open localhost:3449/cards.html in your browser.

o: open
oc: open-cards
r: repl

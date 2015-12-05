PORT=3449

all:
	@cat Makefile

ancient:
	lein ancient

clean:
	lein clean

open:
	open http://localhost:$(PORT)/cards.html

open-prod:
	open resources/public/index.html

prod:
	lein cljsbuild once prod

repl:
	lein figwheel

# Run 'lein figwheel' and then open localhost:3449/cards.html in your browser.

o: open
op: open-prod
r: repl

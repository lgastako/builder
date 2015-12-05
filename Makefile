PORT=3449

all:
	@cat Makefile

ancient:
	lein ancient

clean:
	lein clean

open:
	open resources/public/index.html

open-cards:
	open http://localhost:$(PORT)/cards.html

prod:
	lein cljsbuild once prod

prod-auto:
	lein cljsbuild auto prod

repl:
	lein figwheel

a: ancient
o: open
oc: open-cards
p: prod
pa: prod-auto
r: repl

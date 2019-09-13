from html.parser import HTMLParser

class MyHTMLParser(HTMLParser):
    def handle_starttag(self, tag, attrs):
        print("Start :", tag)
        if len(attrs) > 0:
            for attr in attrs:
                print("-> ", attr[0], " > ", attr[1])

    def handle_endtag(self, tag):
        print("End   :", tag)

    def handle_startendtag(self, tag, attrs):
        print("Empty :", tag)
        if len(attrs) > 0:
            for attr in attrs:
                print("-> ", attr[0], " > ", attr[1])

MyParser = MyHTMLParser()
MyParser.feed(''.join([input().strip() for _ in range(int(input()))]))
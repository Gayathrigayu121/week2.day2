import re
import requests
import csv


s = requests.Session()

url = "https://www.hoffmann-group.com/DE/de/hom/"

Headers = {
    "accept": "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "accept-encoding": "gzip, deflate, br",
    "accept-language": "en-US,en;q=0.9", "cache-control": "max-age=0", "upgrade-insecure-requests": "1",
    "user-agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36 Edg/98.0.1108.62"}
def wr(s):
    s=s.replace('(','')
    s=s.replace(')', '')
    s = s.replace('[', '')
    s = s.replace(']', '')
    s = s.replace("'", '')
    s = s.replace('"', '')
    s = s.replace('>', '')
    return s

if __name__ == '__main__':
    l=[]
    m=[]
    firstUrl="https://www.hoffmann-group.com"
    response = s.get(url,headers=Headers).text
    name = re.findall("filterItemContainer\">.*?title=\"([^\"]*)", response, re.S)
    #print(response)

    secondUrl=re.findall("data-async-url=.*?\".*?href=\"([^\"]*)",response,re.S)

    for i in secondUrl:
        res = requests.get(firstUrl+i).text
        subname=re.findall("<span class=\"filterName\">.*?(.\w+.\w+.\w+).*?</span", res, re.S)
        Secondnewurl =re.findall("<a href=\"([^.?]*)\".title[^.]*button type=\"button\" class=\"btn-empty btn-link btn-block",res,re.S)
        subname.remove("Zurück")
        l.append(subname)
        #for (n) in zip(subname):
            #l.append(wr(str(n)))



        for i in Secondnewurl:
            resnew = requests.get(firstUrl + i).text
            count = re.findall("<strong>(\d*)</strong>", resnew, re.S)
            namenw = re.findall("title=\"([^\d]*)\"[^.]*button type=\"button\" class=\"btn", resnew, re.S)
            l.append(count)
            #for (n) in zip(count):
                #l.append(wr(str(n)))


    print(l)


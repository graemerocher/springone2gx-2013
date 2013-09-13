import demo01.*


class BootStrap {

    def init = { servletContext ->
    	def city = new City(name:"Springfield").save()
    	new Person(city:city,firstName:"Homer", lastName:"Simpson", age:45).save()
    	new Person(city:city,firstName:"Bart", lastName:"Simpson", age:9).save()
    	new Person(city:city,firstName:"Lisa", lastName:"Simpson", age:8).save()
    	new Person(city:city,firstName:"Maggie", lastName:"Simpson", age:1).save()
    	new Person(city:city,firstName:"Marge", lastName:"Simpson", age:42).save()
    }
    def destroy = {
    }
}

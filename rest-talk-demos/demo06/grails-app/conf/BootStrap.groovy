import demo01.*


class BootStrap {

    def init = { servletContext ->
    	new Person(firstName:"Homer", lastName:"Simpson", age:45).save()
    	new Person(firstName:"Bart", lastName:"Simpson", age:9).save()
    	new Person(firstName:"Lisa", lastName:"Simpson", age:8).save()
    	new Person(firstName:"Maggie", lastName:"Simpson", age:1).save()
    	new Person(firstName:"Marge", lastName:"Simpson", age:42).save()
    }
    def destroy = {
    }
}

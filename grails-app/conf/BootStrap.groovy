class BootStrap {

	def authenticateService

	def init = { servletContext ->
		def role = new Role(authority:'ROLE_USER', description:'User').save()
		def user = new User(username:'demo',
				    userRealName:'Demo User',
				    passwd:authenticateService.encodePassword('demo'),
				    enabled:true,
				    email:'demo@demo.com')
		user.addToAuthorities(role)
		user.save()
	}
	def destroy = {
	}
} 
